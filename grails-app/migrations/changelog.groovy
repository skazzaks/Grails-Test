databaseChangeLog = {

	changeSet(author: "devon (generated)", id: "1336793188059-1") {
		createTable(tableName: "BOOK") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_1")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	include file: 'test2.groovy'

	include file: 'security.groovy'

	include file: 'facebook.groovy'
}
