package testapp

import org.aspectj.weaver.NewFieldTypeMunger;

import grails.plugins.springsecurity.Secured;

class TestController {

	def index() 
	
	{ 
		def books = new Book(name: "Test2", author: "author", test: "test", newField: "test", newField2: "test" )
		books.save()
		
		def test = Book.findByName("Test2")
		
		return [book: test]
	}
}
