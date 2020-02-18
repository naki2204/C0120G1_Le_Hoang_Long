let listCustomer = [];
let validateBirthday = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;
let validateEmail = /^\w+([\.-]?\w+)*@\w+([\.;]?\w+)*(\.\w{2,3})+$/;
let checkEditCustomer = false ;
let checkDeteleCustomer=false;
let checkDisplayTotalPay=false;

function displayMainMenu() {
    let choose=prompt("1.Add New Customer." +
        "\n2.Display Information Customer." +
        "\n3.Display Total Pay of Customer." +
        "\n4.Edit Information Customer." +
        "\n5.Delete Customer." +
        "\n6.Exit."
        );
    switch (choose) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            displayCustomers();
            break;
        case "3" :
            chooseDisplayTotalPay();
            break;
        case "4":
            chooseCustomerEdit();
            break;
        case "5":
            chooseDeleteCustomer();
            break;
        default:
            displayMainMenu();
            break;
    }
}

function addNewCustomer() {

    let cus = new Customer();
    let checkbrithday = false;
    let checkEmail = false;
    cus.setNameCustomer(prompt("Indicate your fullname ", ''));
    cus.setIdCard(prompt("Indicate your idcard ", ''));
    do{
        cus.setBrithdayCustomer(prompt("Indicate your date of birth (dd/MM/YYYY): ",''));
        if(validateBirthday.test(cus.getBrithdayCustomer())){
            checkbrithday = true;
        }else {
            alert("Brith is invalid.Please try again");
        }
    }
    while (!checkbrithday);

    cus.setAdressCustomer(prompt("Indicate your address ", ''));

    do{
        cus.setEmailCustomer(prompt("Indicate your email ", ''));
        if(validateEmail.test(cus.getEmailCustomer())){
            checkEmail = true;
        }else {
            alert("Email is invalid.Please try again")
        }
    }
    while (!checkEmail);

    cus.setTypeCustomer("Indicate your typecustomer ", 'Diamond,Platinum,Gold,Sliver,Member');
    cus.setDiscount(prompt("Discount ", ''));
    cus.setNumberOfAccompanying(prompt("Indicate numberOfAccompanying ", ''));
    cus.setTypeRoom(prompt("Indicate the type of room rented ", 'Vip,Business,Normal'));
    cus.setRentDays(prompt("Indicate the number of days rented ", ''));
    cus.setTypeService(prompt("Indicate the type of service ", 'villa,house,room'));
    listCustomer.push(cus);
    displayMainMenu();

}

function displayCustomers() {
    let result = "";
    for (i = 0; i < listCustomer.length ; i++) {
        result += "\n"+(i+1)+"."+"Name:"+ listCustomer[i].getNameCustomer()+
            "; Id Card: "+listCustomer[i].getIdCard();
    }
    result += "\n"+(listCustomer.length+1)+".Back to menu";
    let chooseDislpayInfor=prompt(result);
    if(chooseDislpayInfor !== (listCustomer.length+1)){
        if(!checkDeteleCustomer && !checkDisplayTotalPay) {
            dislplayInformationCustomer(Number.parseInt(chooseDislpayInfor) - 1);
        }else if(checkDeteleCustomer) {
            deteleCustomer(Number.parseInt(chooseDislpayInfor) - 1);
        }else {
            displayTotalPay(Number.parseInt(chooseDislpayInfor) - 1);
        }
    }else {
        checkDisplayTotalPay = false;
        checkDeteleCustomer=false;
        checkEditCustomer = false;
        displayMainMenu();
    }
}

function dislplayInformationCustomer(index){
    if(checkEditCustomer){
        let chooseInforEdit= prompt(
            "1.Name :"+listCustomer[index].getNameCustomer()+
            "\n2.Idcard :"+listCustomer[index].getIdCard()+
            "\n3.Birthday :"+listCustomer[index].getBrithdayCustomer()+
            "\n4.Adress: "+listCustomer[index].getAdressCustommer()+
            "\n5.Email :"+listCustomer[index].getEmailCustomer()+
            "\n6.Type customer :"+listCustomer[index].getTypeCusromer()+
            "\n7.Discount :"+listCustomer[index].getDiscount()+
            "\n8.Number of accompanying :"+listCustomer[index].getNumberOfAccompanying()+
            "\n9.Rent days :"+listCustomer[index].getRentDays()+
            "\n10.Service :"+listCustomer[index].getTypeService()+
            "\n11.Rent room :"+listCustomer[index].getTypeRoom()+
            "\n12.Back. "

        )
        if(chooseInforEdit.toString() !=="12"){
            editInfomationCustomer(Number.parseInt(chooseInforEdit)-1);

        }else {
            displayCustomers();
        }
    }else {
        alert("Information of customer: \n" +
            "Name :"+listCustomer[index].getNameCustomer()+
            "\nIdcard :"+listCustomer[index].getIdCard()+
            "\nBirthday :"+listCustomer[index].getBrithdayCustomer()+
            "\nAdress: "+listCustomer[index].getAdressCustommer()+
            "\nEmail :"+listCustomer[index].getEmailCustomer()+
            "\nType customer :"+listCustomer[index].getTypeCusromer()+
            "\nDiscount :"+listCustomer[index].getDiscount()+
            "\nNumber of accompanying :"+listCustomer[index].getNumberOfAccompanying()+
            "\nRent days :"+listCustomer[index].getRentDays()+
            "\nService :"+listCustomer[index].getTypeService()+
            "\nRent room :"+listCustomer[index].getTypeRoom()
    );
        displayMainMenu()

    }

}

function chooseDisplayTotalPay() {
    checkDisplayTotalPay = true;
    displayCustomers();
}
function displayTotalPay(index) {
    alert(listCustomers[index].totalPays());
    checkDisplayTotalPay = false;
    displayMainMenu();
}
function chooseCustomerEdit() {
    checkEditCustomer=true;
    displayCustomers();
}
function editInfomationCustomer(index) {
    let editInfo =prompt("Indicate info you want to change: ");
    switch (index) {
        case 0:
            listCustomer[index].getNameCustomer(editInfo);
            break;
        case 1:
            listCustomer[index].getIdCard(editInfo);
            break;
        case 2:
            listCustomer[index].getBrithdayCustomer(editInfo);
            break;
        case 3:
            listCustomer[index].getAdressCustommer(editInfo);
            break;
        case 4:
            listCustomer[index].getEmailCustomer(editInfo);
            break;
        case 5:
            listCustomer[index].getTypeCusromer(editInfo);
            break;
        case 6:
            listCustomer[index].getDiscount(editInfo);
            break;
        case 7:
            listCustomer[index]].getNumberOfAccompanying(editInfo);
            break;
        case 8:
            listCustomer[index].getRentDays(editInfo);
            break;
        case 9:
            listCustomer[index].getTypeService(editInfo);
            break;
        case 10:
            listCustomer[index].getTypeRoom(editInfo);
            break;
        default :
            alert("Fail!!!!")
            return;
    }
    function chooseDeleteCustomer() {
        checkDeteleCustomer=true;
        displayCustomers();

    }
    function deteleCustomer(index) {
        let chooseConfirm=prompt(
            "Are you sure detele customer: Name: "+listCustomer[index].getNameCustomer()+
            "Idcard: "+listCustomer[index].getIdCard()+
            "\n1.Yes\n2.No"
        );
        if (chooseConfirm===1){
            listCustomer.slice(index,1);
            alert("Delete complete!!!");
        }

    }

displayMainMenu();