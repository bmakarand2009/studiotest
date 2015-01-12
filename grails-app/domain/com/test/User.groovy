package com.test

class User {

    static constraints = {
      //guId(maxSize:40, unique:true)
//      notes (nullable:true)
//      classes(nullable:true)
//      memberships(nullable:true)
//      visits(nullable:true)
//      purchasedItems(nullable:true)
//      address(nullable:true)
//      barcode(nullable:true)
//      emergencyContact(nullable:true)
//      emergencyContactPhone(nullable:true)
        username(nullable: false, blank: false, unique: true)

    }

    static hasMany = [ roles: Role, permissions: String, classSchedule:ClassSchedule]
    static belongsTo = [tenant :Tenant]


//    static hasMany =[notes:NoteBase,classes:ClassBase,memberships:MembershipBase,visits:VisitBase,purchasedItems:PurchasedItemsBase]
//    static belongsTo = ClassBase

    //String guId
    String username
    String passwordHash

    String id
    String firstName
    String lastName
//    String barcode
//    Address address
    Boolean isTeacher

//    String emergencyContact
//    String emergencyContactPhone

    static mapping = {
    //  id generator: 'assigned', type: 'string'
      id generator: 'uuid', type:'string'
    //  guId column:'guId'
      firstName column:'firstName'
      lastName column:'lastName'
//      emergencyContact column: 'emergencyContact'
//      emergencyContactPhone column:'emergencyContactPhone'
    }
}
