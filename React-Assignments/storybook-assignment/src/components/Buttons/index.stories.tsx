import React from 'react'
import { ComponentMeta, ComponentStory } from '@storybook/react'
import ButtonComponent  from './index'

export default {
    title: "atoms/Button",
    component: ButtonComponent,
    argTypes: {
        variant: {
            control: 'select', 
            options: ['text', 'outlined', 'contained', 'undefined'],
        }
    }
} as ComponentMeta<typeof ButtonComponent>;

const Template: ComponentStory<typeof ButtonComponent> = (args) => (
    <ButtonComponent {...args}/>
)

export const button = Template.bind({});
button.args = {
    label: "Buttons",
    variant: "contained",
}

