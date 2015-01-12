package com.test
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames = true, includeFields = true, excludes = 'dateCreated,lastUpdated,metaClass')
@EqualsAndHashCode
class Tenant {
   static constraints = {
    	orgId(blank:false,unique:true)
		name(blank:false,length:5) //needs to be range
        //createdBy(editable:false)
        //updatedBy(nullable:true)
        //memberCategoryList(nullable: true)
        //oppStatus(nullable: true)
    }


	static hasMany=[users:User]
    //,taskTypeList:TaskType,oppCategoryList:OppCategory,
    // memberCategoryList:MemberCategory,oppStatus:OppStatus]
	

    String orgId
	String name
    Date dateCreated  // grails will auto timestamp
    Date lastUpdated  // grails will auto timestamp

}
