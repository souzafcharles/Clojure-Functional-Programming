(def extra-tax-10 0.10)
(def extra-tax-20 0.20)

(defn calculate-salary [salary]
  (cond
    (<= salary 1000) salary
    (< salary 2000) (+ salary (* salary extra-tax-10))
    :else (+ salary (* salary extra-tax-20))))

(defn display-salary [salary]
  (println (format "Salary Amount (GBP): %.2f" (calculate-salary salary))))

;; Examples
(display-salary 1000.00)
(display-salary 1500.00)
(display-salary 2000.00)
