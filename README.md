# JRebel case 01027173

## Description

This is a simple project to reproduce the issue with JRebel and Spring Boot

## Steps to reproduce

1. Run the project using the included run config "run-app"
2. Open the browser and go to http://localhost:8888
3. Confirm that the page works
4. Stop the application, then debug with JRebel
5. Confirm the app still works
6. Make a change to any Groovy file (e.g. `src/main/groovy/sample/MainView.groovy`) and recompile
7. JRebel will reload the app, but the page will not work anymore:

```text
2024-01-19T10:42:47.358+02:00  INFO 1291974 --- [v-server-output] c.v.b.devserver.DevServerOutputTracker   : Failed to load url /generated/vite-devmode.ts (resolved id: /generated/vite-devmode.ts). Does the file exist?
2024-01-19T10:42:47.358+02:00  INFO 1291974 --- [v-server-output] c.v.b.devserver.DevServerOutputTracker   : Failed to load url /generated/vaadin.ts (resolved id: /generated/vaadin.ts). Does the file exist?
```
