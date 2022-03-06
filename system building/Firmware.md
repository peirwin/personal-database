## Firmware Introduction
#### Firmware: library for the [[ISA]]
---
[[Firmware]] is low level software pre-installed on hardware in order to initialize the [[boot process]] and to provide runtime services for OS

###### examples:

[[BIOS]]  is a firmware on a system's motherboard that executes a [[boot loader]]. It is stored on [[ROM]] memory, which prevents users from tampering with the core of the device.However, before the boot sequence is activated, the [[BIOS]] firmware begins a [[POST]], where the hardware is initialized and functionally tested. After all POST tests have been passed, the BIOS calls the Master boot record, which sits at the top of the boot drive (specified by BIOS). This consists of information regarding how the system partitions are organized, which allows the bootloader to understand how to boot the system.

[[EUFI]] is a forked project built off of [[BIOS]] by [[Intel]]. It addressed the problems of BIOS and set out to fix them. The EUFI firmware had the ability to boot larger partitions, introduced a pre-OS [[GUI]], multiple languages, C language programming (instead of assembly), and backwards and forward compatibility. These advantages made the EUFI the industry standard. 

**EUFI [[archetecture]]compatibilities**
- 

bootstrap - executes an array of instructions with one input

## Partitions

##### [[GUID]] partitions table (GPT):
- standard layout for EUFI
- allows a max of 2 TiB
- 64 bit addresses (2<sup>64</sup> sectors)
<img src="https://i.imgur.com/xUqQ5Ay.png" width=70% hieght=70%/>

##### MBR (master boot record):

**x86 w/ BIOS**

- MBR in physical memory
- contains pure machine code
- calls the VBR of the targetted partition 
  
**other (UEFI)**

- skips this process
- boots with predefined info