<?php
    require_once 'UberCar.php';
    //How to use Inheritance in PHP
    class UberPool extends UberCar{
        public $brand;
        public $model;

        public function __construct($license, $driver, $brand, $model){
            //To pass parameter to construct use parent
            parent::__construct($license,$driver);
            $this->brand = $brand;
            $this->model = $model;
        }
    }
?>