(ns traning-clojure-codes.core-test
  (:require [clojure.test :refer :all]
            [traning-clojure-codes.core :refer :all]))

(deftest input-validation-delivery-fee-test
  (testing "Should throw exception for non-numeric value"
    (is (thrown-with-msg? IllegalArgumentException #"The value must be a number." (delivery-fee "abc")))) ; Renamed taxa-entrega
  (testing "Should throw exception for null value"
    (is (thrown-with-msg? IllegalArgumentException #"The value must be a number." (delivery-fee nil)))) ; Renamed taxa-entrega
  (testing "Should throw exception for negative value"
    (is (thrown-with-msg? IllegalArgumentException #"The value cannot be negative." (delivery-fee -10))))) ; Renamed taxa-entrega

(deftest calculate-delivery-fee-test
  (testing "Purchase value up to 100 BRL"
    (is (= 15 (delivery-fee 100)))) 
  (testing "Purchase value greater than 100 and less than or equal to 200 BRL"
    (is (= 5 (delivery-fee 200)))) 
  (testing "Purchase value greater than 200 BRL"
    (is (= 0 (delivery-fee 200.01))))) 