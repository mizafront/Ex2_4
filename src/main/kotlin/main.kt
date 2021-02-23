import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import java.io.FileInputStream

fun main() {
    val options = FirebaseOptions.builder()
            .setCredentials(GoogleCredentials.fromStream(FileInputStream("fcm.json")))
            .setDatabaseUrl(dbUrl)
            .build()

    FirebaseApp.initializeApp(options)

    val message = Message.builder()
            .putData("action", "NewPost")
            .putData("content", """{
          "userId": 1,
          "userName": "Vasiliy",
          "postId": 2,
          "postAuthor": "Netology",
          "textContent" : "Hi. I like u post.\n My name is Vasily. \n Я из Китая. "
        }""".trimIndent())
            .setToken(token)
            .build()

    FirebaseMessaging.getInstance().send(message)
}