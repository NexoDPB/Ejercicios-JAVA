package org.example.POO.banking.model.transaction;

public enum TransactionType {
    /*
    * enum: it's define a limit set of constants
    * if this constant have attributes then only have GETTERS, and have constructor
    * public enum ClassEnum {
    *   CONSTANT(attribute1, attribute2, ...)
    *   ClassEnum(type attribute1, type attribute2, ...) {
    *       this constructor is important for uses CONSTANT with its attributes
    *   }
    *   --GETTERS--
    * }
    */
    DEPOSIT,
    WITHDRAWAL,
    TRANSFER,
    INTEREST,
    MAINTENANCE_FEE
}
