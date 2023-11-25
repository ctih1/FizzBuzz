/**
 * You can edit, run, and share this code.
 * https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS45LjIwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS5cbiAqIHBsYXkua290bGlubGFuZy5vcmdcbiAqL1xuXG5mdW4gbWFpbigpIHtcbiAgICBGaXp6QnV6eigxMDApXG59XG5cbmZ1biBGaXp6QnV6eihuOiBJbnQpIHtcbiAgICBmb3IgKGkgaW4gMS5yYW5nZVRvKG4pKSB7XG4gICAgICAgIGlmIChpJTM9PTAgJiYgaSU1PT0wKSB7XG4gICAgICAgICAgICBwcmludGxuKFwiRml6ekJ1enpcIilcbiAgICAgICAgfVxuICAgICAgICBlbHNlIGlmKGklMz09MCkge1xuICAgICAgICAgICAgcHJpbnRsbihcIkZpenpcIilcbiAgICAgICAgfVxuICAgICAgICBlbHNlIGlmKGklNT09MCkge1xuICAgICAgICAgICAgcHJpbnRsbihcIkJ1enpcIilcbiAgICAgICAgfVxuICAgICAgICBlbHNlIHtcbiAgICAgICAgICAgIHByaW50bG4oaSlcbiAgICAgICAgfVxuICAgIH1cbn0ifQ==
 */

fun main() {
    FizzBuzz(100)
}

fun FizzBuzz(n: Int) {
    for (i in 1.rangeTo(n)) {
        if (i%3==0 && i%5==0) {
            println("FizzBuzz")
        }
        else if(i%3==0) {
            println("Fizz")
        }
        else if(i%5==0) {
            println("Buzz")
        }
        else {
            println(i)
        }
    }
}