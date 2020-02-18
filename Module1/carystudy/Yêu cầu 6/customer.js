let Customer =function (nameCustomer) {

    this.setNameCustomer= function (nameCustomer) {
        this.nameCustomer= nameCustomer;
    };
    this.getNameCustomer=function () {
        return this.nameCustomer;
    };

    this.setIdCard= function (idCard) {
        this.idCard= idCard;
    };
    this.getIdCard =function () {
        return this.idCard;
    };

    this.setBrithdayCustomer = function (brithdayCustomer) {
        this.brithdayCustomer= brithdayCustomer;
    };
    this.getBrithdayCustomer= function () {
        return this.brithdayCustomer;
    };

    this.setEmailCustomer = function (emailCustomer) {
        this.emailCustomer = emailCustomer;
    };
    this.getEmailCustomer = function () {
        return this.emailCustomer;
    };

    this.setAdressCustomer = function (adressCustomer) {
        this.adressCustomer = adressCustomer;
    };
    this.getAdressCustommer = function (){
        return this.adressCustomer;
    };

    this.setTypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer;
    };
    this.getTypeCusromer = function () {
        return this.typeCustomer;
    };

    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };

    this.setNumberOfAccompanying = function (numberAccompanying) {
        this.numberOfAccompanying = numberAccompanying;
    };
    this.getNumberOfAccompanying = function () {
        return this.numberOfAccompanying;
    };

    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    };
    this.getTypeRoom = function () {
        return this.typeRoom;
    };

    this.setRentDays = function (rentDays) {
        this.rentDays = rentDays;
    };
    this.getRentDays = function () {
        return this.rentDays;
    };

    this.setTypeService = function (typeService) {
        this.typeService = typeService;
    };
    this.getTypeService = function () {
        return this.typeService;
    };

    this.totalPays = function () {
        let moneyPerdays = 0;
        if(this.getTypeService() === "villa"){
            moneyPerdays = 500;
        }else {
            if(this.getTypeService() === "house"){
            moneyPerdays = 300;
        }else {
                moneyPerdays = 100;
            }
        }
        return moneyPerdays = parseFloat( this.getRentDays())*(1-parseFloat(this.getDiscount())/100);
    };










}