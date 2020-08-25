<?php
    require_once 'UberCar.php';
    //How to use Inheritance in PHP
    class UberBlack extends UberCar{
        public $typeCarAccepted;
        public $seatsMaterial;

        public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
            //To pass parameter to construct use parent
            parent::__construct($license,$driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }
    }
?>