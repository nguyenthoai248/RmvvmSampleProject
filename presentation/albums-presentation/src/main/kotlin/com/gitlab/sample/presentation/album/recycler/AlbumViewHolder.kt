/***
 * Copyright 2018 Hadi Lashkari Ghouchani
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
 *
 * */
package com.gitlab.sample.presentation.album.recycler

import android.view.View
import com.gitlab.sample.presentation.album.R
import com.gitlab.sample.presentation.album.di.viewholder.AlbumsViewHolder
import com.gitlab.sample.presentation.album.di.viewholder.AlbumsViewHolderBridge
import com.gitlab.sample.presentation.album.rmvvm.AlbumClickedAction
import com.gitlab.sample.presentation.common.extention.inflate
import com.gitlab.sample.presentation.common.recycler.BaseViewHolder
import kotlinx.android.synthetic.main.album.view.*
import javax.inject.Inject

class AlbumViewHolder(view: View) : BaseViewHolder<AlbumRecyclerState>(view), AlbumsViewHolder {

    private var data: AlbumRecyclerState? = null

    @Inject
    constructor(bridge: AlbumsViewHolderBridge) : this(
            bridge.parent.inflate(R.layout.album)
    )

    init {
        itemView.setOnClickListener {
            data?.album?.apply { actionStream.onNext(AlbumClickedAction(id)) }
        }
    }

    override fun bindTo(data: AlbumRecyclerState) {
        this.data = data
        itemView.titleView.text = data.album.title
    }
}