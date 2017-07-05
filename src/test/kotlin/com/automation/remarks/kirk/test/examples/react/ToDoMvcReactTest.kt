package com.automation.remarks.kirk.test.examples.react

import com.automation.remarks.kirk.Browser
import com.automation.remarks.kirk.conditions.have
import org.testng.annotations.Test

/**
 * Created by sergey on 01.07.17.
 */
class ToDoMvcReactTest {

    @Test fun testCanAddNewItemInList() {
        Browser.drive {
            to(::TodoPage) {
                addTask("Item-1", "Item-2")
                taskList.should(have.size(2))
            }
        }
    }
}