# directory structure

### global structure
home partition:
- /etc
	- config files `dotfiles`
- /bin
	- executable information
- /usr
	- local preferences per user
	- data storage

### communication 

- symbolic link
	- specifies a global path for communication between files
		- `ln -s {file} {linkname}`
	- check the link's path with
		- `readlink {file}`
	

