# Vending Machine

### Requirements

Design a vending machine that:

1. Sells multiple products.
2. Each product has:
    - Product ID
    - Name
    - Price
    - Quantity
3. User can select a product.
4. User inserts money.
5. Machine should check whether sufficient money was inserted.
6. If sufficient:
    - Dispense the product.
    - Return remaining change.
7. If insufficient:
    - Tell the user how much more is required.
8. User should be able to cancel the transaction and get their money back.
9. Machine should not dispense a product if it is out of stock.
10. Machine should maintain its current state.

### Example

```
User
 ↓
Select Coke (₹40)
 ↓
Insert ₹50
 ↓
Machine
 ├── Check stock
 ├── Check payment
 ├── Dispense Coke
 └── Return ₹10
```



