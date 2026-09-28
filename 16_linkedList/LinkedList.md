# Singly Linked List


```mermaid
flowchart LR
    HEAD["HEAD"] --> A["10"]
    A --> B["20"]
    B --> C["30"]
    C --> NULL["NULL"]
```

### limitations
- get is O(n) time

# Circular Linked List
A circular linked list is a linked list where the last node points back to the first node.

```mermaid
flowchart LR
    HEAD["HEAD"] --> A["10"]
    A --> B["20"]
    B --> C["30"]
    C --> A
```
## Structure

```text
10 → 20 → 30
↑           ↓
└───────────┘
```

The `next` of the last node points to `head` instead of `null`.