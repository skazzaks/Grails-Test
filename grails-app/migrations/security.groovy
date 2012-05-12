databaseChangeLog = {

	changeSet(author: "devon (generated)", id: "1336836721290-1") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rolePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "devon (generated)", id: "1336836721290-2") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "devon (generated)", id: "1336836721290-3") {
		createTable(tableName: "user_role") {
			column(name: "role_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "devon (generated)", id: "1336836721290-4") {
		addPrimaryKey(columnNames: "role_id, user_id", constraintName: "user_rolePK", tableName: "user_role")
	}

	changeSet(author: "devon (generated)", id: "1336836721290-5") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK143BF46ABBA50859", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "devon (generated)", id: "1336836721290-6") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK143BF46A60CFCC39", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	changeSet(author: "devon (generated)", id: "1336836721290-7") {
		createIndex(indexName: "authority_unique_1336836721115", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "devon (generated)", id: "1336836721290-8") {
		createIndex(indexName: "username_unique_1336836721135", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "devon (generated)", id: "1336836721290-9") {
		createIndex(indexName: "FK143BF46A60CFCC392", tableName: "user_role") {
			column(name: "user_id")
		}
	}

	changeSet(author: "devon (generated)", id: "1336836721290-10") {
		createIndex(indexName: "FK143BF46ABBA508592", tableName: "user_role") {
			column(name: "role_id")
		}
	}
}
