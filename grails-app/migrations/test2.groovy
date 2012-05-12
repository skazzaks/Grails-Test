databaseChangeLog = {

	changeSet(author: "devon (generated)", id: "1336795896673-1") {
		addColumn(tableName: "book") {
			column(name: "new_field2", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
