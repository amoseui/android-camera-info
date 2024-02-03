/*
 * Copyright 2024 amoseui (Amos Lim)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amoseui.cameraspecs.data.camera2

import com.amoseui.cameraspecs.data.camera2.proto.CameraData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CameraIdRepository @Inject constructor(private val dataSource: CameraIdSystemDataSource) {

    val cameraIdStream: Flow<List<CameraData.Camera>> = dataSource.cameraIdStream

    suspend fun refreshCameraIds() = dataSource.refreshCameraIds()
}
