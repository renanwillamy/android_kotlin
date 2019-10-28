package com.example.myfirstkotlin

data class Email (
    val user: String,
    val subject: String,
    var preview: String,
    var date: String,
    var stared: Boolean,
    var unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false
    fun build () : Email = Email(user,subject,preview,date,stared,unread,false)
}

fun email(block:EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user= "Some User"
        subject = "Subject test"
        preview = "Something is written here but it makes no sense"
        date = "15 mai"
    },
    email {
        user= "Renan Willamy"
        subject = "Subject test 2"
        preview = "Something is written here but it makes no sense"
        date = "20 mai"
    },
    email {
        user= "Bruna"
        subject = "Subject test"
        preview = "Something is written here but it makes no sense"
        date = "15 mai"
    },
    email {
        user= "Willamy"
        subject = "Subject test 2"
        preview = "Something is written here but it makes no sense"
        date = "20 mai"
    },
    email {
        user= "Jose"
        subject = "Subject test"
        preview = "Something is written here but it makes no sense"
        date = "15 mai"
    },
    email {
        user= "Eugenio"
        subject = "Subject test 2"
        preview = "Something is written here but it makes no sense"
        date = "20 mai"
    },
    email {
        user= "Aristides"
        subject = "Subject test"
        preview = "Something is written here but it makes no sense"
        date = "15 mai"
    },
    email {
        user= "Fabricio"
        subject = "Subject test 2"
        preview = "Something is written here but it makes no sense"
        date = "20 mai"
    },
    email {
        user= "Alan"
        subject = "Subject test"
        preview = "Something is written here but it makes no sense"
        date = "15 mai"
    },
    email {
        user= "Maria"
        subject = "Subject test 2"
        preview = "Something is written here but it makes no sense"
        date = "20 mai"
    }
)