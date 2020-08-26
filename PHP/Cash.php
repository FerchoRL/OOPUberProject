<?php
    require_once 'Payment.php';
    class Cash extends Payment{
        
        public function __construct($ammount){
            parent::__construct($ammount);
        }
    }
?>