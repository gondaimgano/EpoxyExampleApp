package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemContactBinding

open class ItemContactModel:EpoxyModelWithHolder<ItemContactModel.Holder>() {

    @EpoxyAttribute
    var mobile=""
    @EpoxyAttribute
    var fax=""
    @EpoxyAttribute
    var email=""

    class Holder:EpoxyHolder(){
         lateinit var binding:ItemContactBinding
         private set

        override fun bindView(itemView: View) {
            binding= ItemContactBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_contact
    }

    override fun createNewHolder(parent: ViewParent): Holder = Holder()

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder.binding){
            txtPhoneNumber.text = mobile
            txtEmailAddress.text= email
            txtfaxNumber.text=fax
        }
    }
}