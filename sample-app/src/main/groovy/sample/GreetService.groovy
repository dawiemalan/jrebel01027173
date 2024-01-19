package sample

class GreetService {

	String greet(String name) {

		if (name == null || name.isEmpty()) {
			return "Hello anonymous user";
		} else {
			return "Hello " + name;
		}
	}
}
