package testapp

import testapp.User

class FacebookUser {

	long uid
    String accessToken

	static belongsTo = [user: User]

	static constraints = {
		uid unique: true
	}
}
