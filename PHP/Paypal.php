<?php
    require_once 'Payment.php';
    class Paypal extends Payment{
        public $email;

        public function __construct($ammount,$email){
            parent::__construct($ammount);
            $this->email = $email;
        }
    }
?>