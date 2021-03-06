/**
 * Copyright (C) 2018 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gitlab.sample.presentation.album_details.di.viewholder

import androidx.annotation.MainThread
import android.view.ViewGroup
import com.gitlab.sample.presentation.album_details.di.AlbumDetailsScope
import javax.inject.Inject

@AlbumDetailsScope
class AlbumViewHolderBridge @Inject constructor() {
    var itemWidth: Int = 0
        @MainThread
        get
        @MainThread
        set

    lateinit var parent: ViewGroup
        @MainThread
        get
        @MainThread
        set
}