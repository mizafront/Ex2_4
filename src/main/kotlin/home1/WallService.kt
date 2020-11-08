package home1

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post
        post.id ++

        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (updatePost in posts) {
            if (updatePost.id == post.id) {
                updatePost.text = "New text.txt"
                println("Пост обновлён")
                return true
            }
            break
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (targetPost in posts) {
            if (targetPost.id == comment.postID) {
                comments += comment
                println("Комментарий добавлен")
            }else throw PostNotFoundException("Ошибка при добавлении комментария")
        }
    }
}

