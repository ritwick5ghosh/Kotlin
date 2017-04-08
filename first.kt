/**
 * Created by rghosh on 3/31/17.
 */

data class A(val a: Int)

fun main(args: Array<String>) {
    println("This should be replaced with underscores in place of spaces".replaceSpaceWithUnderscore())
}

val replaceSpaceWithUnderscore: (String.() -> String) = { this.replace(' ', '_') }