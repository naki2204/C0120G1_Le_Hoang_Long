let Employee = function () {
    this.setNameEmployee = function () {
        this.name = name;
    };
    this.getNameEmployee = function () {
        return this.name;
    };
    this.setIdCardEmployee = function () {
        this.idCard = idCard;
    };
    this.getIdCardEmployee = function () {
        return this.idCard;
    };
    this.setBirthdayEmployee = function () {
        this.birthDay = birthDay;
    };
    this.getBirthdayEmployee = function () {
        return this.birthDay;
    };
    this.setEmailEmployee = function () {
        this.email = email;
    };
    this.getEmailEmployee = function () {
        return this.email;
    };

    this.setAddressEmployee = function (address) {
        this.adress = address;
    };
    this.getAddressEmployee = function () {
        return this.adress;

    };
    this.setChucVu = function () {
        this.chucVu = chucvu;
    };
    this.getChucVu = function () {
        return this.chucVu;
    };
    this.setTienLuong = function (salary) {
        this.tienLuong = tienLuong;
    };
    this.getTienLuong = function () {
        if (this.chucVu === "Manager") {
            return parseInt(this.tienLuong) + 500;
        } else if (this.chucVu === "Sale") {
            return parseInt(this.tienLuong) + 300;
        } else if (this.chucVu === "Marketing") {
            return parseInt(this.tienLuong) + 200;
        } else
            return this.tienLuong;
    };
}


