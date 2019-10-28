package com.example.myfirstkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.email_item.view.*

class EmailAdapter (val emails: MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.email_item,parent,false)
        return EmailViewHolder(view)
    }

    override fun getItemCount(): Int = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    inner class EmailViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(email: Email) {
            with(email){
                itemView.txt_icon.text = user.first().toString()
                itemView.txt_user.text = user
                itemView.txt_date.text = date
                itemView.txt_preview.text = preview
                itemView.txt_subject.text = subject
            }
        }

    }
}