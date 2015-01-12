package com.test

class Role {
  
  	String name

    static hasMany = [ users: User, permissions: String ]
    static belongsTo = User
    boolean isAdminRole

    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
}
