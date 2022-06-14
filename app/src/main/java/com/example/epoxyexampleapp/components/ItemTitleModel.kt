package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemTitleBinding


open class ItemTitleModel : EpoxyModelWithHolder<ItemTitleModel.TitleHolder>(){
    @EpoxyAttribute var text:String=""
    override fun getDefaultLayout(): Int {
        return R.layout.item_title
    }

    override fun createNewHolder(parent: ViewParent): TitleHolder =TitleHolder()

    override fun bind(holder: TitleHolder) {
        super.bind(holder)
        with(holder.binding){
            this.textView.text = text
        }
    }



    class TitleHolder:EpoxyHolder(){
        lateinit var binding:ItemTitleBinding
        private set
        override fun bindView(itemView: View) {
            binding = ItemTitleBinding.bind(itemView)
        }

    }
}

