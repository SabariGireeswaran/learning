"""
different_methods.py

Simple, easy-to-understand examples showing the three kinds of methods in Python:
- Instance methods
- Class methods
- Static methods

Run `python different_methods.py` to see the demo output.
"""
from __future__ import annotations


class BankAccount:
    """A tiny example to demonstrate instance, class, and static methods."""

    # Class variable shared across all instances
    total_accounts: int = 0

    def __init__(self, owner: str, balance: float = 0.0) -> None:
        self.owner = owner
        self.balance = balance
        BankAccount.total_accounts += 1

    # ------------------ Instance methods ------------------
    def deposit(self, amount: float) -> None:
        """Instance method: operates on an instance and can read/modify instance state.

        Example: account.deposit(50)
        """
        if not self.is_valid_amount(amount):
            raise ValueError("Amount must be positive")
        self.balance += amount

    def withdraw(self, amount: float) -> None:
        """Another instance method that changes instance state."""
        if not self.is_valid_amount(amount):
            raise ValueError("Amount must be positive")
        if amount > self.balance:
            raise ValueError("Insufficient funds")
        self.balance -= amount

    # ------------------ Class methods ------------------
    @classmethod
    def from_string(cls, data: str) -> "BankAccount":
        """Class method as an alternative constructor.

        Example: BankAccount.from_string('Alice:150') -> BankAccount('Alice', 150)
        """
        owner, balance_str = data.split(":")
        return cls(owner.strip(), float(balance_str))

    @classmethod
    def get_total_accounts(cls) -> int:
        """Class method that reads class-level data (shared across instances)."""
        return cls.total_accounts

    # ------------------ Static methods ------------------
    @staticmethod
    def is_valid_amount(amount: float) -> bool:
        """Static method: a utility function related to the class but does not access
        instance (`self`) or class (`cls`). Useful as a helper.
        """
        return amount > 0

    def __repr__(self) -> str:
        return f"BankAccount(owner={self.owner!r}, balance={self.balance:.2f})"


# ------------------ Small demo ------------------

def demo() -> None:
    print("Demo: instance, class, and static methods\n")

    # Instance methods
    a = BankAccount("Alice", 100)
    print("Initial:", a)
    a.deposit(50)
    print("After deposit:", a)

    try:
        a.withdraw(200)
    except ValueError as exc:
        print("Withdraw failed:", exc)

    # Class method (alternative constructor)
    b = BankAccount.from_string("Bob:200")
    print("Created with classmethod:", b)

    # Class method reading class-level data
    print("Total accounts (class method):", BankAccount.get_total_accounts())

    # Static method (utility function)
    print("Is 10 valid amount?", BankAccount.is_valid_amount(10))
    print("Is -5 valid amount?", BankAccount.is_valid_amount(-5))


if __name__ == "__main__":
    demo()
