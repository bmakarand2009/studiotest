package com.test

class ClassSchedule {

     static constraints = {
      students(nullable:true)
//      classSize(nullable:true)
//      teacher(nullable:true)
    }

    static hasMany =[students:User]
    static belongsTo = User


    //String guId
    Tenant tenant
    String id
    String name
//    String tenant
//    Integer classSize
//    ClientBase teacher
//    RoomBase room

    static mapping = {
      //id generator: 'assigned', type: 'string'
      id generator: 'uuid', type:'string'
      //guId column:'guId'
  //    startTime column:'startTime'
  //    endTime column:'endTime'
  ///    classSize column:'classSize'
      students lazy:false
  //    room fetch: 'join'
    }
}
