<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        require_once 'Account.php';
        require_once 'UberCar.php';
        require_once 'UberX.php';
        $uberDriver = new Account("Fernando Lagunes","INE");
        $mazda = new UberCar("JWX934",$uberDriver);
        #print_r($mazda->driver->name);

        $Audi = new UberX("LCF342",$uberDriver, "Audi", "A3");
        $Audi->printDataCar();
    ?>
</body>
</html>