package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemTaskCarouselBinding

open class TaskCarouselModel: EpoxyModelWithHolder<TaskCarouselModel.TaskCarouselHolder>() {
    @EpoxyAttribute
    var text:String=""
    override fun getDefaultLayout(): Int= R.layout.item_task_carousel
    override fun createNewHolder(parent: ViewParent): TaskCarouselHolder = TaskCarouselHolder()

    override fun bind(view: TaskCarouselHolder) {
        super.bind(view)
        with(view.binding){
            this.messageTask.text=text
        }
    }

    inner class TaskCarouselHolder: EpoxyHolder(){
        lateinit var binding:ItemTaskCarouselBinding
        private set
        override fun bindView(itemView: View) {
            binding = ItemTaskCarouselBinding.bind(itemView)
        }
    }
}