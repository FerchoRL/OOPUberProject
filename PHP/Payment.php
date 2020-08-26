<?php
class Payment{
    public $id;
    public $ammount;

    public function __construct($ammount){
        $this->ammount = $ammount;
    }

    public function printInfoPayment(){
        echo "Payment ammount: $this->ammount";
    }
}
?>