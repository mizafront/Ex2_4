package home1

import java.lang.RuntimeException

class PostNotFoundException(message: String): RuntimeException(message) {
}