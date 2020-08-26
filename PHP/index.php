<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        require_once 'User.php';
        require_once 'UberCar.php';
        require_once 'UberX.php';
        require_once 'Card.php';
        $uberDriver = new User("Fernando Lagunes","INE");
        $mazda = new UberCar("JWX934",$uberDriver);
        #print_r($mazda->driver->name);

        $Audi = new UberX("LCF342",$uberDriver, "Audi", "A3");
        $Audi->printDataCar();

        $FerPayment = new Card(672.34,"8822663377440011","123","12/12/2020");
        $FerPayment->printInfoPayment();
    ?>
</body>
</html>