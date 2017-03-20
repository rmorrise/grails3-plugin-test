package my.plugin


import grails.dev.commands.*

class MyExampleCommand implements GrailsApplicationCommand {

    @Override
    boolean handle() {
        println "Hello World"
        return true
    }
}
