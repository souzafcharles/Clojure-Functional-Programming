# Delivery Fee Calculation

**Instructions**: Develop a <code>Clojure</code> application that calculates a delivery fee based on a given purchase value. The application must incorporate </code>Test-Driven Development (TDD)</code> for input validation, ensuring the provided value is a valid, non-negative number.

### Delivery Fee Rules:

* For purchase values **up to 100**, the delivery fee is **15**.
* For purchase values **greater than 100 and up to 200**, the delivery fee is **5**.
* For purchase values **greater than 200**, the delivery fee is **0** (free delivery).

### Input Validation Rules:

* If the input value is **not a number** (e.g., a string, `nil`), an `IllegalArgumentException` must be thrown with the message "The value must be a number.".
* If the input value is **negative**, an `IllegalArgumentException` must be thrown with the message "The value cannot be negative.".

---

### Example Inputs and Outputs:

| **Test Case: Valid Inputs**                     | **Input (Function Call: `(delivery-fee value)`)** | **Expected Output**                                                     |
| :---------------------------------------------- | :------------------------------------------------ | :---------------------------------------------------------------------- |
| Purchase value up to 100                        | `(delivery-fee 100)`                              | `15`                                                                    |
| Purchase value greater than 100, up to 200      | `(delivery-fee 200)`                              | `5`                                                                     |
| Purchase value greater than 200                 | `(delivery-fee 200.01)`                           | `0`                                                                     |

| **Test Case: Invalid Inputs**                   | **Input (Function Call: `(delivery-fee value)`)** | **Expected Output**                                                     |
| :---------------------------------------------- | :------------------------------------------------ | :---------------------------------------------------------------------- |
| Non-numeric value                               | `(delivery-fee "abc")`                            | `IllegalArgumentException` with message "The value must be a number."   |
| Null value                                      | `(delivery-fee nil)`                              | `IllegalArgumentException` with message "The value must be a number."   |
| Negative value                                  | `(delivery-fee -10)`                              | `IllegalArgumentException` with message "The value cannot be negative." |
