<?php
    require_once 'Payment.php';
    class Card extends Payment{
        public $number;
        public $cvv;
        public $date;

        public function __construct($ammount, $number, $cvv, $date){
            parent::__construct($ammount);
            $this->number = $number;
            $this->cvv = $cvv;
            $this->date = $date;
        }
        
    }
    
?>