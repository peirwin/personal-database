## lecture one

**entity-component relationship**
- an entity is an object
	- contains components
	- ex: rock, player, tree

- a component is a property

	- ex: position, speed

**ECS systems**
- Movement
	`for (e:entities) { e.pos += e.velocity;}`
	
- Engine architecture:
