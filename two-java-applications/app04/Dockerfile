FROM node:22-alpine AS builder
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

FROM nginx:stable-alpine
WORKDIR /www
COPY --from=builder /app/dist .
COPY nginx.conf /etc/nginx/

CMD ["nginx", "-g", "daemon off;"]

