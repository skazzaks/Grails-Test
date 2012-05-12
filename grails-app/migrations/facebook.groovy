databaseChangeLog = {

	changeSet(author: "devon (generated)", id: "1336842436514-1") {
		createTable(tableName: "facebook_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "facebook_userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "access_token", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "uid", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "devon (generated)", id: "1336842436514-2") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "facebook_user", constraintName: "FK609FD5A460CFCC39", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	changeSet(author: "devon (generated)", id: "1336842436514-3") {
		createIndex(indexName: "FK609FD5A460CFCC392", tableName: "facebook_user") {
			column(name: "user_id")
		}
	}

	changeSet(author: "devon (generated)", id: "1336842436514-4") {
		createIndex(indexName: "uid_unique_1336842436307", tableName: "facebook_user", unique: "true") {
			column(name: "uid")
		}
	}
}
