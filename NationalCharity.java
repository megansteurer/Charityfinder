package com.example.charityfinder;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import org.bson.types.ObjectId;


public class NationalCharity extends RealmObject {
    @PrimaryKey
    private ObjectId _id;

    private String Address;

    private String Category;

    private String Charity_name;

    private String City;

    private String Mission_statement;

    private String State;

    private String Web_address;

    private String Zipcode;

    public NationalCharity() {}

    public NationalCharity(String Charity_name, String Category, String Address, String City, String State, String Zipcode, String Mission_statement, String Web_address) {
        this.Charity_name = Charity_name;
        this.Category = Category;
        this.Address = Address;
        this.City = City;
        this.State = State;
        this.Zipcode = Zipcode;
        this.Mission_statement = Mission_statement;
        this.Web_address = Web_address;
    }

    // Standard getters & setters
    public ObjectId get_id() { return _id; }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getAddress() { return Address; }
    public void setAddress(String Address) { this.Address = Address; }

    public String getCategory() { return Category; }
    public void setCategory(String Category) { this.Category = Category; }

    public String getCharity_name() { return Charity_name; }
    public void setCharity_name(String Charity_name) { this.Charity_name = Charity_name; }

    public String getCity() { return City; }
    public void setCity(String City) { this.City = City; }

    public String getMission_statement() { return Mission_statement; }
    public void setMission_statement(String Mission_statement) { this.Mission_statement = Mission_statement; }

    public String getState() { return State; }
    public void setState(String State) { this.State = State; }

    public String getWeb_address() { return Web_address; }
    public void setWeb_address(String Web_address) { this.Web_address = Web_address; }

    public String getZipcode() { return Zipcode; }
    public void setZipcode(String Zipcode) { this.Zipcode = Zipcode; }

}


