#!/usr/bin/env kotlinc -script 
import java.io.File;

println("Hello from Kotlin!")
for (arg in args) {
    println("arg: $arg")
}
val files = File("/Users/rghosh/notespump/queue").listFiles()
for(f in files) {
 println(f.name)
}
