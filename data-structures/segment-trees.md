# Tries (Keyword Trees)
Tree data structure based on prefix of a string.

**Prefix**: any first `n <= |S|` letters of a string `S`.

* Each node in the tree corresponds to a letter.
* Strings are read from top to bottom. All prefixes of length 1 stored in level 1, prefixes of length 2 in level 2, and so on.
* Root node: Special (entry) node that has outgoing edges to nodes with 1 letter (level 1 nodes)

## Adding words
**Input:** String `s`
```
current_node = root

for each char c in s:

    if (c is child of current_node):
        current_node = current_node.getChild(c)
    else:
        new_node = create new node with char c
        add new_node as child to current_node
        current_node = new_node
```

## Querying for existence
**Input:** String `s`

**Output:** true if `s` exists, false otherwise

```
current_node = root

for each char c in s:

    if (c is child of current_node):
        current_node = current_node.getChild(c)
    else:
        return false

return true
```