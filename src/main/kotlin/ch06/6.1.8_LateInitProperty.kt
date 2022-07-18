package ch06

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyService{
    fun performAction() = "foo"
}

class MyTest{
    private var myService: MyService? = null

    @Before
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction(){
        Assert.assertEquals(myService!!.performAction(), "foo")
    }
}

class MyTest1{
    private lateinit var myService: MyService

    @Before
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction(){
        Assert.assertEquals(myService.performAction(), "foo")
    }
}